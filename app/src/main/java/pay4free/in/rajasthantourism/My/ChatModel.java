package pay4free.in.rajasthantourism.My;

/**
 * Created by AAKASH on 03-12-2017.
 */

public class ChatModel {
    public String message;
    public boolean isSend;

    public ChatModel()
    {

    }

    public ChatModel(String message, boolean isSend) {
        this.message = message;
        this.isSend = isSend;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSend() {
        return isSend;
    }

    public void setSend(boolean send) {
        isSend = send;
    }
}