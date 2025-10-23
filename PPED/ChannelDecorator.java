abstract class ChannelDecorator implements Channel {
    protected Channel decoratedChannel;

    public ChannelDecorator(Channel channel) {
        this.decoratedChannel = channel;
    }

    @Override
    public void send() {
        decoratedChannel.send();
    }

    @Override
    public void receive() {
        decoratedChannel.receive();
    }
}