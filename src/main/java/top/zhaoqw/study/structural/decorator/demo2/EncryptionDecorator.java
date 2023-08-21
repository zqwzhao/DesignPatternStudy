package top.zhaoqw.study.structural.decorator.demo2;

import java.util.Base64;

public class EncryptionDecorator implements DataSource {
    private DataSource datasource;

    public EncryptionDecorator(DataSource dataSource) {
        this.datasource = dataSource;
    }

    @Override
    public void writeData(String data) {
        datasource.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(datasource.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}