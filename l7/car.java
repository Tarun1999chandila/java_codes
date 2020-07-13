package l7;

public class car implements Comparable<car> {
int speed;
String color;
int price; 

public car(int speed,String color,int price) {
	this.speed=speed;
	this.color=color;
	this.price=price;
}

public String toString() {
	return "s:"+speed+"c:"+color+"p:"+price;
	//System.out.println(s);
}
public  int  compareTo(car other ) {
	return this.speed-other.speed;
}

}