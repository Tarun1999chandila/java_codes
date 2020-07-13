package l8;

public class dynamicstack extends oops {

	@Override
		public  void push(int item) throws Exception{
			if( isfull()) {
	int[] na=new int[2*data.length];
	for(int i=0;i<data.length;i++) {
		na[i]=data[i];
	}
	data=na;
	}
	
	super.push(item);
	}
}
