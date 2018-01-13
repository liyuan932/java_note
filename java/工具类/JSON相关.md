
## 包com.alibaba.fastjson

### com.alibaba.fastjson.JSONObject类
```
JSONObject json = new JSONObject();
json.put("name","张三");
json.put("age",18);
JSONObject.toJavaObject(json,User.class);
```