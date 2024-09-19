public class Artwork{

private String title;
private int year;
private Artist artist;

public void setTitle(String t){
this.title=title;

}


public void setYear(int  y){
this.year=year;

}

public void setArtist(Artist a){
this.artist=artist;

}

public String getTitle(){
return title;
}

public int getyear(){
return year;
}
public Artist getartist(){
return artist;
}


Artwork(String title,int year,Artist artist){

this.title=title;
this.year=year;
this.artist=new Artist(artist.getName());

}

Artwork(Artist a){

this.title=title;
this.year=year;
this.artist=new Artist();

}

Artwork(){

this.title=title;
this.year=year;
this.artist=new Artist();

}




public void display1(){

System.out.println("The title:"+title);
System.out.println("The year:"+year);
artist.Display();


}






}