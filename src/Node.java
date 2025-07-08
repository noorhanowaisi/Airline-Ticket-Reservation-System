import java.util.Date;

public class Node<T extends Comparable<T>> {
	 Node<T> next;
	 private T data;


	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int flight_number,Capacity,Ticket_number;
	 private String airline_name, source,destination,Full_name,Passport_number,Nationality;
	 private Date Birthdate;
	public Node(int flight_number,String airline_name,String source,String destination,int Capacity) {
		super();
		this.flight_number=flight_number;
		this.airline_name=airline_name;
		this.source=source;
		this.destination=destination;
		this.Capacity=Capacity;
	}
	
	public Node(int flight_number, int Ticket_number, String Full_name, String Passport_number, String Nationality,
			Date Birthdate) {
		super();
		this.flight_number = flight_number;
		this.Ticket_number = Ticket_number;
		this.Full_name = Full_name;
		this.Passport_number = Passport_number;
		this.Nationality = Nationality;
		this.Birthdate = Birthdate;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
