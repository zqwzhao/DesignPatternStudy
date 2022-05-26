package top.zhaoqw.study.structural.decorator.demo1;

import java.io.IOException;

public abstract class InputStream {
  //...
  public int read(byte b[]) throws IOException {
    return read(b, 0, b.length);
  }

  public int read(byte b[], int off, int len) throws IOException {
    //...
    return 0;
  }

  public long skip(long n) throws IOException {
    //...
    return 0;
  }

  public int available() throws IOException {
    return 0;
  }

  public void close() throws IOException {}

  public synchronized void mark(int readlimit) {}

  public synchronized void reset() throws IOException {
    throw new IOException("mark/reset not supported");
  }

  public boolean markSupported() {
    return false;
  }
}

class BufferedInputStream extends InputStream {
  protected volatile InputStream in;

  protected BufferedInputStream(InputStream in) {
    this.in = in;
  }

  //...实现基于缓存的读数据接口...
}

class DataInputStream extends InputStream {
  protected volatile InputStream in;

  protected DataInputStream(InputStream in) {
    this.in = in;
  }

  //...实现读取基本类型数据的接口
}
