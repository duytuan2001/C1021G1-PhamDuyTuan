package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryServiceImpl implements IDictionaryService {
    @Override
    public String searchDictionary(String search) {
        String value = "";
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("hello", "xin chào");
        stringMap.put("telephone", "điện thoại");
        stringMap.put("Volunteer", "tình nguyện viên");
        stringMap.put("Salary", "Lương");
        stringMap.put("tree", "cây");
        stringMap.put("Animal", "động vật");
        stringMap.put("sport", "thể thao");
        stringMap.put("Shoe", "giày");
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            if (search.equals(entry.getKey())) {
                value = entry.getValue();
            }
        }
        return value;
    }
}
