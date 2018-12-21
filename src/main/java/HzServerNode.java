import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IdGenerator;

import java.util.Map;

public class HzServerNode {
    public static void main(String[] args) {
        HazelcastInstance hzInstance = Hazelcast.newHazelcastInstance();

        Map<Long, String> map = hzInstance.getMap("data");

        IdGenerator idGenerator = hzInstance.getIdGenerator("newId");

        map.put(idGenerator.newId(), "salih");
        map.put(idGenerator.newId(), "ufuk");
        map.put(idGenerator.newId(), "ugur");
        map.put(idGenerator.newId(), "selcuk");

        System.out.println(map.toString());
    }
}
