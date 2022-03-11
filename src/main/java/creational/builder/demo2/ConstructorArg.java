package creational.builder.demo2;

/**
 * @author: zhaoqw
 * @date: 2022/2/18 09:44
 */
public class ConstructorArg {
  private boolean isRef;
  private Class type;
  private Object arg;
  // TODO: 待完善...
  private ConstructorArg(Builder builder) {
    this.isRef = builder.isRef;
    this.type = builder.type;
    this.arg = builder.arg;
  }

  public static class Builder{
    // 需要设置的参数
    private Class type;
    private Object arg;
    // 有默认值的参数
    private boolean isRef = true;

    public ConstructorArg build() {
      if (arg == null) {
        throw new IllegalArgumentException("arg不能为空");
      }
      if (isRef) {
        if (!(arg instanceof String)) {
          throw new IllegalArgumentException("arg必须为String类型的对象");
        }
      }else {
        if (null == type) {
          throw new IllegalArgumentException("isRef为true时, type不能为空");
        }
      }
      return new ConstructorArg(this);
    }

    public Builder setType(Class type) {
      this.type = type;
      return this;
    }
    public Builder setArg(Object arg) {
      this.arg = arg;
      return this;
    }
    public Builder setRef(boolean ref) {
      this.isRef = ref;
      return this;
    }
  }

  public static void main(String[] args) {
    ConstructorArg constructorArg = new Builder()
        .setRef(true)
        .setArg(String.class)
        .setType("aaaa".getClass())
        .build();



  }

}
