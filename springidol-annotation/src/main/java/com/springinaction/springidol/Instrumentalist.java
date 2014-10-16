//<start id="instrumentalist_java" />
package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {
  //<start id="autowire_constructor" />对构造器标注@Autowired，表示当创建Bean时，即使
//XML文件中没有使用<constructor-age>元素配置Bean,该构造器也需要进行自动装配。
  @Autowired
  public Instrumentalist(Instrument instrument) {
    this.instrument = instrument;
  }

  //<end id="autowire_constructor" />

  public void perform() throws PerformanceException {
    System.out.print("Playing " + song + " : ");
    instrument.play();
  }

  private String song;

  public void setSong(String song) {
    this.song = song;
  }

  public String getSong() {
    return song;
  }

  //<start id="autowire_property" />可以直接标注属性，删除setter方法，不受private影响
  @Autowired
  private Instrument instrument;

  //<end id="autowire_property" />

  //<start id="autowire_nonsetter" /> @Autowired可以标注任何方法
  @Autowired
  public void heresYourInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  //<end id="autowire_nonsetter" />

  //<start id="autowire_setter" />这个注解告诉spring对setInstrument方法尝试用ByType自动装配
  @Autowired
  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  //<end id="autowire_setter" />

  public Instrument getInstrument() {
    return instrument;
  }
}
//<end id="instrumentalist_java" />
