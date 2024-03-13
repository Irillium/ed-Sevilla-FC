package com.iesam.sevillaFC.features.partido.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.sevillaFC.features.partido.domain.Partido;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PartidoFileDataSource {

    private String nameFile = "partido.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Partido>>() {
    }.getType();

    public void save(Partido model) {
        List<Partido> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Partido> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Partido> models) {
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


    public Partido findById(String id) {
        List<Partido> models = findAll();
        for (Partido model : models) {
            if (Objects.equals(model.getId(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Partido> findAll() {
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
        List<Partido> newList = new ArrayList<>();
        List<Partido> models = findAll();
        for (Partido model : models) {
            if (model.getId().equals(modelId)) {
                newList.add(model);
            }
        }
        saveList(newList);
    }
}
