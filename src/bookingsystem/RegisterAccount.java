package bookingsystem;
import com.github.cliftonlabs.json_simple.JsonObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class RegisterAccount {
    private String FirstName;
    private String LastName;

    private long PhoneNumebr;
    private String EmailId;

    private String Address;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public long getPhoneNumebr() {
        return PhoneNumebr;
    }

    public void setPhoneNumebr(long phoneNumebr) {
        PhoneNumebr = phoneNumebr;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    RegisterAccount(String fname,String lname,long number,String emailId,String address){
        this.FirstName=fname;
        this.LastName=lname;
        this.PhoneNumebr=number;
        this.EmailId=emailId;
        this.Address=address;

    }
    public void WriteInfo(){
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
        jsonobject.put("FirstName",getFirstName());
        jsonobject.put("LastName",getLastName());
        jsonobject.put("PhoneNumber",getPhoneNumebr());
        jsonobject.put("Email Id",getEmailId());
        jsonobject.put("Address",getAddress());

        //Calling the writeJsonToFile method to write the json object to the json file
        writeJsonToFile(jsonobject,filename,folderPath);



        }

    public long generateRandomNumber(){
        return 1000+new Random().nextInt(10000);
    }
    public void writeJsonToFile(JsonObject jsonobject,String filename,String folderPath){
        try(FileWriter fileWriter=new FileWriter(folderPath+"\\"+filename)){
            fileWriter.write(jsonobject.toString());
            System.out.println("JSON file '" + filename + "' created successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

