/*
 * 5. Create a class Connection.
The Connection class keeps track of the number of connections to the server.
Whenever an object is created, a connection is established.
The class has a disconnect method and a display method that display the number of connections to the server.
 */
package Tutorial.T8;

public class Connection {

    private static int numOfConnection = 0;

    public Connection() {
        connect();
    }
    
    public void connect(){
        numOfConnection++;
    }
    
    public void disconnect(){
        if(numOfConnection == 0){
            System.out.println("Current number of commection : 0");
        }else{
        numOfConnection--;
        }
    }
    
    public String toString(){
        return "Number of connection: " + numOfConnection;
    }
// Done
}
