package study.websocket.netty.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ClientHandler extends SimpleChannelInboundHandler {
    
	// 서버에게 문자열을 받아 channelRead0() 메소드를 호출한다.
	@Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) {
        System.out.println((String)msg);
    }

	// 예외가 발생할 시 호출한다.
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause){
        cause.printStackTrace();
        ctx.close();
    }
}
