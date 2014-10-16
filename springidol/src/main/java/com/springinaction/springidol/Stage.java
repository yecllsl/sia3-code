//<start id="stage_java" /> 
package com.springinaction.springidol;

public class Stage {
  private Stage() {
  }

  private static class StageSingletonHolder {
    static Stage instance = new Stage(); //<co id="co_lazyLoad"/>延迟加载实例
  }

  public static Stage getInstance() {
    return StageSingletonHolder.instance; //<co id="co_returnInstance"/>返回实例
  }
}
//<end id="stage_java" />
