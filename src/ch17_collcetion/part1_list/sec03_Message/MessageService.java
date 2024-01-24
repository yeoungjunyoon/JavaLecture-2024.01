package ch17.collcetion.part1_list.sec03_Message;

import java.util.List;

public interface MessageService {
	int DELETED	= 1;
	
	Message findByMid(int mid);
	
	List<Message> getMessageListAll();
	
	List<Message> getMessageListByWriter(String writer);
	
	void inserMessage(Message message);
	
	void updateMessage(Message message);
	
	void deleteMessage(int mid);

	void insertMessage(Message message);
}
