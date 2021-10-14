package Internet;

import java.util.ArrayList;

public interface CommandReceiver {
    public void run(Client.Command command);
}
