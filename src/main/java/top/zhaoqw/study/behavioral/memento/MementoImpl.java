package top.zhaoqw.study.behavioral.memento;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author zhaoqw
 * @date 2023/8/21
 */
public class MementoImpl<T> implements Memento {
    private T snapshot;
    public MementoImpl(T snapshot) {
        this.snapshot = snapshot;
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(snapshot);
            T clone = (T)mapper.readValue(json, snapshot.getClass());
            this.snapshot = clone;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    public T getSnapshot() {
        return snapshot;
    }
}
