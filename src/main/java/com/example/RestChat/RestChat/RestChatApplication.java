package com.example.RestChat.RestChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RestChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestChatApplication.class, args);
    }
}
//@SpringBootApplication
//@ServerEndpoint(value = "/chat/{username}", decoders = MessageDecoder.class, encoders = MessageEncoder.class)
//public class RestChatApplication {
//	private Session session;
//	private static final Set<RestChatApplication> chatEndpoints = new CopyOnWriteArraySet<>();
//	private static HashMap<String, String> users = new HashMap<>();
//
//	@OnOpen
//	public void onOpen(Session session, @PathParam("username") String username) throws IOException, EncodeException {
//
//		this.session = session;
//		chatEndpoints.add(this);
//		users.put(session.getId(), username);
//
//		Message message = new Message();
//		message.setFrom(username);
//		message.setContent("Connected!");
//		unicast(message, session.getId());
//		// broadcast(message);
//	}
//
//	@OnMessage
//	public void onMessage(Session session, Message message) throws IOException, EncodeException {
//		message.setFrom(users.get(session.getId()));
//		unicast(message, session.getId());
//		// broadcast(message);
//
//	}
//
//	@OnClose
//	public void onClose(Session session) throws IOException, EncodeException {
//		chatEndpoints.remove(this);
//		Message message = new Message();
//		message.setFrom(users.get(session.getId()));
//		message.setContent("Disconnected!");
//		broadcast(message);
//	}
//
//	@OnError
//	public void onError(Session session, Throwable throwable) {
//		// Do error handling here
//	}
//
//	private static void broadcast(Message message) throws IOException, EncodeException {
//		chatEndpoints.forEach(endpoint -> {
//			synchronized (endpoint) {
//				try {
//					endpoint.session.getBasicRemote().sendObject(message);
//				} catch (IOException | EncodeException e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	private static void unicast(Message message, String sessionId) throws IOException, EncodeException {
//		chatEndpoints.forEach(endpoint -> {
//			synchronized (endpoint) {
//				try {
//					if (endpoint.session.getId().equalsIgnoreCase(sessionId)) {
//						endpoint.session.getBasicRemote().sendObject(message);
//					}
//				} catch (IOException | EncodeException e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//}
