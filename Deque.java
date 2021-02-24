import java.lang.reflect.Array;
import java.util.Arrays;

@SuppressWarnings("unchecked")

public class Deque<Item> {
    private Item[] deque;
    private int access ;
    private int size;

    /***
     *constructor: create an empty Deque with initial
     *capacity of 10
     */
    public Deque() {
	//TO BE IMPLEMENTED
    	deque= (Item[]) new Object[10];
    	access =0;
    	size=0;
    }

    
    
    /***
     *constructor: create an empty Deque with initial
     *capacity of n
     */
    public Deque(int n) {
	//TO BE IMPLEMENTED
    	deque= (Item[]) new Object[n];
    	access =0;
    	size=0;
    }
  
    
    /***
     *add an item to the front of the Deque
     *double the array capacity if Deque is full
     */
    public void addToFront(Item item) {
	//TO BE IMPLEMENTED
    	/*if (!((deque[deque.length-1])==null)) {
    		deque= Arrays.copyOf(deque, deque.length*2);
    	}
    	for (int i=deque.length-1;i>0;i--) {
    		deque[i]=deque[i-1];
    		 +=2;
    	}
    	deque[0]=item;
    	 +=1;*/
    	if (size==deque.length) {
    		deque= Arrays.copyOf(deque, deque.length*2);
    	
    	}
    	for (int i=size; i>0; i--) {
    		deque[i]= deque[i-1];
    		
    		
    		 
    	}
    	
    	deque[0]=item;
    	
    	size++;
    }

    /***
     *add an item to the back of the Deque;
     *double the array capacity if the Deque is full
     ***/
    public void addToBack(Item item) {
	//TO BE IMPLEMENTED
    	/*
    	if (!((deque[deque.length-1])==null)) {
    		deque= Arrays.copyOf(deque, deque.length*2);
    	}
    	
    	for (int i=0; i<deque.length-1; i++) {
    		if (deque[i]==null) 
    			deque[i]=item;
    			 +=2;
    			break;
    		}
    	}
    	*/
    	if (size==deque.length) {
    		deque= Arrays.copyOf(deque, deque.length*2);
    		
    	}
    	
    	deque[size]=item;
    	
    	
    	size++;
    	
    }

    /***
     *remove and return the front item from the Deque;
     *throw EmptyDequeException if the Deque is empty;
     *reduce the array capacity by half if the size 
     *of the Deque size falls below floor(N/4) where
     *N is the array capacity, but do not resize it 
     *to be below the default capacity, which is 10
     ***/
    public Item getFirst() throws EmptyDequeException {
	//TO BE IMPLEMENTED
    	Item ans;
    	
    	if (size==0) {
    		
    		throw new EmptyDequeException();
    		
    	}else {
    		ans= deque[0];
    		
    		for (int i=0; i<size-1; i++) {
    			deque[i]=deque[i+1];
    			
    			
    		}
    		deque[size-1]=null;
    		
    		size--;
    		if (size<deque.length/4 && deque.length/2>=10) {
    			deque=Arrays.copyOf(deque, deque.length/2);
    			
    		}
    	}
    	return ans;
    	/*else {
    		ans=deque[0];
    		 +=1;
    	}
    	
    	for (int i=0; i<deque.length-1; i++) {
    		deque[i]=deque[i+1];
    		deque[deque.length-1]=null;
    		 +=3;
    		if (i>20 && deque[i]==null && i<((deque.length/4)%1)) {
    			deque= Arrays.copyOf(deque, deque.length/2);
    			 +=1;
    			break;
    		}
    		
    	}
    	return ans;*/
    }

     /***
     *remove and return the back item from the Deque;
     *throw EmptyDequeException if the Deque is empty;
     *reduce the array capacity by half if the size 
     *of the Deque size falls below floor(N/4) where
     *N is the array capacity, but do not resize it 
     *to be below the default capacity, which is 10
     ***/
    public Item getLast() throws EmptyDequeException {
	//TO BE IMPLEMENTED
    	Item ans=null;
    	if (size==0) {
    		throw new EmptyDequeException();
    	}else {
    		ans=deque[size-1];
    		deque[size-1]=null;
    		
    		
    		size--;
    		if (size<deque.length/4 && deque.length/2>=10) {
    			deque= Arrays.copyOf(deque, deque.length/2);
    			
    		}
    		
    		return ans;
    	}
    	/*if (deque[0]==null) {
    		 +=1;
    		throw new EmptyDequeException();
    		
    	}else {
    	
    	for (int i=0; i<deque.length; i++) {
    		deque[i]=deque[i+1];
    		if (i==deque.length) {
    			ans= deque[i];
    			deque[i]=null;
    			 +=4;
    		}else if(deque[i+1]==null) {
    			ans=deque[i];
    			deque[i]=null;
    			 +=4;
    		}
    		 +=1;
    		
    		if (i>20 && deque[i]==null && i<((deque.length/4)%1)) {
    			 +=1;
    			deque= Arrays.copyOf(deque, deque.length/2);
    			break;
    		}
    	}
    	return ans;
    	}*/
    }
    
    /***
     *return true if the Deque is empty;
     *return false if the Deque is not empty
     ***/
    public boolean isEmpty() {
	//TO BE IMPLEMENTED
    	return (size==0);
    	
    }

    /***
     *return the size of the Deque (i.e. the 
     *number of elements currently in the Deque)
     ***/
    public int size() {
	//TO BE IMPLEMENTED
    	return size;
    }

    /***
     *return but do not remove the front item in the Deque;
     *throw an EmptyDequeException if the Deque is empty
     */
    public Item peekFirst() throws EmptyDequeException {
	//TO BE IMPLEMENTED
    	if (size==0) {
    		
    		throw new EmptyDequeException();
    	}
    	
    	return deque[0];
    	
    }

    /***
     *return but do not remove the back item in the Deque;
     *throw an EmptyDequeException if the Deque is empty
     */
    public Item peekLast() throws EmptyDequeException {
	//TO BE IMPLEMENTED
    	if (size==0) {
    		throw new EmptyDequeException();
    	}
    	
    	return deque[size-1];
    }
    
    /***
     *return the underlying array
     ***/
    public Item[] getArray() {
	//TO BE IMPLEMENTED
    	
    	return deque;
    }

    /***
     *return the array  es count
     ***/
    public int getAccessCount() {
	//TO BE IMPLEMENTED
    	return  access;
    	
    }
    
    /***
     *reset the array   count to 0
     ***/
    public void resetAccessCount() {
	//TO BE IMPLEMENTED
    	access =0;
    }
    
    public static void main(String[] args) {
	//TO BE IMPLEMENTED
    	
    }	
}
