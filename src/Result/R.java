package Result;
//一个结果类
public class R {
  private boolean flag;
  private String code;
  private Object data;
  private String message;

  public boolean isFlag() {
    return flag;
  }

  public void setFlag(boolean flag) {
    this.flag = flag;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override   //重写父类Object的方法
  public String toString() {
    return "{" +
            "flag=" + flag +
            ", code='" + code + '\'' +
            ", data=" + data +
            ", message='" + message + '\'' +
            '}';
  }

  public R(boolean flag, String code, Object data, String message) {
    this.flag = flag;
    this.code = code;
    this.data = data;
    this.message = message;
  }
  public R(boolean flag, Object data) {
    this.flag = flag;
    this.data = data;
  }
}
