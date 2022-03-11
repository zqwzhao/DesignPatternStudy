package creational.builder.demo3;

import java.util.Objects;

/**
 * @author: zhaoqw
 * @date: 2022/2/21 14:29
 */
public class NyPizza extends Pizza{
  public enum Size { SMALL, MEDIUM, LARGE}
  private final Size size;

  NyPizza(Builder builder) {
    super(builder);
    this.size = builder.size;
  }

  public static class Builder extends Pizza.Builder<Builder> {
    public final Size size;


    public Builder(Size size) {
      this.size = Objects.requireNonNull(size);
    }

    @Override
    Pizza build() {
      return new NyPizza(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }
}
