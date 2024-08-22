package com.CIC.demoJPA.service;

import com.CIC.demoJPA.entity.D10Entity;
import com.CIC.demoJPA.entity.D10_ToChucEntity;
import com.CIC.demoJPA.repository.D10Repository;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class D10ServiceImpl implements D10Service {
    @Autowired
    private D10Repository d10Repository;
    private D10_ToChucEntity d10ToChucEntity = new D10_ToChucEntity();

    @Override
    public String createD10() {
        JsonParser jsonParser = new JsonParser();
        JsonElement obj;
        try(FileReader reader = new FileReader("C:\\Users\\XuanDuong\\Downloads\\D1033420220418.001.json")) {
            obj = jsonParser.parse(reader);
            JsonObject jsonObject = obj.getAsJsonObject();

            D10Entity d10Entity = new D10Entity();
            d10Entity.setKB001(jsonObject.get("KB001").toString());
            d10Entity.setKB002(jsonObject.get("KB002").toString());
            d10Entity.setKB003(jsonObject.get("KB002").toString());

            JsonArray jsonElements = jsonObject.getAsJsonArray("TOCHUC");
            List<D10_ToChucEntity> d10ToChucEntities = new ArrayList<>();

            jsonElements.forEach( t -> d10ToChucEntities.add(parseD10_ToChuc(t.getAsJsonObject())));


            System.out.println("aks");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return "done";
    }
    private D10_ToChucEntity parseD10_ToChuc(JsonObject D10){
        d10ToChucEntity.setTTC03(D10.get("TTC03").toString());
        d10ToChucEntity.setTTC04(D10.has("TTC04") ? D10.get("TTC04").toString() : "");
        d10ToChucEntity.setTC001(D10.has("TT001") ? D10.get("TC001").toString() : "");
        d10ToChucEntity.setTC002(D10.has("TC002") ? D10.get("TC002") .toString() : "");
        d10ToChucEntity.setTC003(D10.has("TC003") ? D10.get("TC003").toString() : "");
        d10ToChucEntity.setTC004(D10.has("TC004") ? D10.get("TC004").toString() : "");
        d10ToChucEntity.setTC005(D10.has("TC005") ? D10.get("TC005").toString() : "");
        return d10ToChucEntity;
    }
}
