package bookingsystem;

import com.github.cliftonlabs.json_simple.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class UserRegistration {
    private String Name;
    private String Address;
    private String Email;
    private long PhoneNumber;


    //creating a constructor with parameters.
    public UserRegistration(String Name, String address, String email, long phoneNumber) {
        this.Name = Name;
        this.Address = address;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }


    //generateRandomNumber() generate random numbers and return ;
    public long generateRandomNumber(){
        return 1000+new Random().nextInt(10000);
    }

    //writeJsonToFile()create Json file and save in the folder
    public void writeJsonToFile(JsonObject jsonobject,String filename,String folderPath){
        try(FileWriter fileWriter=new FileWriter(folderPath+"\\"+filename)){
            fileWriter.write(jsonobject.toString());
            System.out.println("JSON file '" + filename + "' created successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


    //WriteInfo() function will create a folder and write the given data in a file and save the file in the folder.
    public void WriteInfo(){
        ///in folder path put your path where you want to create your folder
        String folderPath = "D:\\Masters\\Future\\java\\javaTraining2023_24\\src\\bookingsystem\\javaFolder";
        File folder=new File(folderPath);
        if(!folder.exists()){
            boolean create=folder.mkdir();
            String result= (create) ? "Folder created successfully." :"Failed to create the folder.";
            System.out.println(result);

        }
        else {
            System.out.println("The folder already exists.");
        }

        //generateRandomNumber() method will return rendom number.
        long randomNumber=generateRandomNumber();
        //create file name
        String filename="ACC_"+randomNumber+".json";

        //Create a JSONObject with  data
        JsonObject jsonobject=new JsonObject();
        jsonobject.put("Name",getName());
        jsonobject.put("PhoneNumber",getPhoneNumber());
        jsonobject.put("Email Id",getEmail());
        jsonobject.put("Address",getAddress());

        //Calling the writeJsonToFile method to write the json object to the json file
        writeJsonToFile(jsonobject,filename,folderPath);



    }
}
