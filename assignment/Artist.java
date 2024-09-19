public class Artist{

private String name;

public void setName(String n){

this.name=name;
}

public String getName(){

return name;
}

Artist(){
name="Maham";

}
Artist(String name){
this.name=name;

}
public void Display(){

System.out.println("The name of artist is :"+name);

}




}