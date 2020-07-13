package l8;

public class dynamicqueue extends queue {
public void enqueue(int item ) throws Exception{
if(isfull()) {
	int[] na=new int[2*data.length];
for(int i=0;i<size;i++) {
	int idx=(front+i)%data.length;
	na[idx]=data[idx];
}
data=na;
front=0;}
super.enqueue(item);

}
}

