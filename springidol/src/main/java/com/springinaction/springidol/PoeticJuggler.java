//<start id="poeticjuggler_java" /> 
package com.springinaction.springidol;

public class PoeticJuggler extends Juggler {
  private Poem poem;

  public PoeticJuggler(Poem poem) { //<co id="co_injectPoem"/>注入peom
    super();
    this.poem = poem;
  }

  public PoeticJuggler(int beanBags, Poem poem) { // <co id="co_injectPoemBeanBags"/>注入豆子数和poem
    super(beanBags);
    this.poem = poem;
  }

  public void perform() throws PerformanceException {
    super.perform();
    System.out.println("While reciting...");
    poem.recite();
  }
}
//<end id="poeticjuggler_java" />