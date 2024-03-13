package com.iesam.sevillaFC.features.club.data.local;

import com.google.gson.reflect.TypeToken;
import com.iesam.sevillaFC.features.club.domain.Club;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import com.google.gson.Gson;
public class ClubFileDataSource {

    private String nameFile = "club.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Club>>() {
    }.getType();

    public void save(Club model) {
        List<Club> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Club> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Club> models) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public Club findById(String id) {
        List<Club> models = findAll();
        for (Club model : models) {
            if (Objects.equals(model.getId(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Club> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }

    public void delete(String modelId) {
        List<Club> newList = new ArrayList<>();
        List<Club> models = findAll();
        for (Club model : models) {
            if (model.getId().equals(modelId)) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
}
