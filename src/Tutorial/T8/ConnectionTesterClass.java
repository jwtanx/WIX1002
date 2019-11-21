/*
 * 5. Create a class Connection.
The Connection class keeps track of the number of connections to the server.
Whenever an object is created, a connection is established.
The class has a disconnect method and a display method that display the number of connections to the server.
 */
package Tutorial.T8;

public class ConnectionTesterClass {
    public static void main(String[] args) {
        
        Connection a = new Connection();
        System.out.println(a.toString());
        
        Connection b = new Connection();
        System.out.println(a.toString());
        
        Connection c = new Connection();
        System.out.println(a.toString());
        
        a.disconnect();
        System.out.println(a.toString());
        System.out.println(b.toString());
        
        b.disconnect();
        System.out.println(a.toString());
        
        System.out.println("\nDone @ 211119, 19:47");
        
    }
}
