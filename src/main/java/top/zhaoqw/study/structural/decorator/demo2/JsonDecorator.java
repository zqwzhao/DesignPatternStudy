package top.zhaoqw.study.structural.decorator.demo2;

import com.alibaba.fastjson.JSONObject;
import net.bytebuddy.description.method.MethodDescription;

import java.util.HashMap;
import java.util.Map;

public class JsonDecorator implements DataSource {
    private DataSource dataSource;

    public JsonDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(toJson(data));
    }

    @Override
    public String readData() {
        return fromJson(dataSource.readData());
    }

    private String toJson(String stringData) {
        Map map = new HashMap();
        map.put("content", stringData);
        return JSONObject.toJSONString(map);
    }

    private String fromJson(String json) {
     JSONObject jsonObject = JSONObject.parseObject(json);
     return jsonObject.get("content").toString();
    }
}