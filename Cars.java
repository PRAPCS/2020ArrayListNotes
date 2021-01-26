public class Cars{

private String myColor;
private int myMpg;

public Cars(String color, int mpg){
myColor = color;
myMpg = mpg;
}

public String getColor(){
  return myColor;
}

public void setColor(String newColor){
  myColor = newColor;
}

public String toString(){
  return "COLOR: "+myColor+" , MPG: "+myMpg;
}

}



