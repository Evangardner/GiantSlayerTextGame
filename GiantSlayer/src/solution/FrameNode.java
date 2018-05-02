package solution;



public class FrameNode {
	public FrameNode[] links;
	public String image;
	public String text;
	
	public FrameNode() {
		links = new FrameNode[6];
		image = null;
		text = null;	
	}
	public FrameNode(FrameNode[] link, String image, String text) {
		links = new FrameNode[link.length];
		int x = 0;
		for(FrameNode f : links)
		{
			this.links[x] = f;
			x++;
		}
		//this.links = links;
		this.image = image;
		this.text = text;
	
	}
	
	public void setLink(int i, FrameNode x) {
		links[i] = x;
	}
	public FrameNode getLink(int i)
	{
		return links[i];
	}
	
	public void setImage(String x) {
		image = x;
	}
	public String getImage() {
		return image;
	}
	public void setText(String x) {
		text = x;
	}
	public String getText() {
		return text;
	}
	
	

}
