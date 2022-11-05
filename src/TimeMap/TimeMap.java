package TimeMap;

import java.util.ArrayList;
import java.util.Objects;

public class TimeMap {

    ArrayList<TimeMapValue> arrayList;

    public TimeMap() {
        arrayList = new ArrayList<>();
    }

    public void set(String key, String value, int timestamp) {
        arrayList.add(new TimeMapValue(key, value, timestamp));
    }

    public String get(String key, int timestamp) {
        TimeMapValue result = new TimeMapValue();
        for (TimeMapValue value : arrayList)
            if(Objects.equals(value.key, key))
                if (value.timestamp <= timestamp)
                    if (value.timestamp > result.timestamp)
                        result = value;

        return result.value;
    }

    private ArrayList<TimeMapValue> getArrayListOnKey(String key){
        ArrayList<TimeMapValue> result = new ArrayList<TimeMapValue>();
        for (TimeMapValue value : arrayList)
            if (Objects.equals(value.key, key))
                result.add(value);
        return result;
    }

    class TimeMapValue{
        private String key;
        private String value;
        private int timestamp;

        public TimeMapValue(){
            key = "";
            value = "";
            timestamp = Integer.MIN_VALUE;
        }
        public TimeMapValue(String key, String value, int timestamp) {
            this.key = key;
            this.value = value;
            this.timestamp = timestamp;
        }
    }
}
