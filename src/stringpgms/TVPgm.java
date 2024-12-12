package stringpgms;

interface TVremote
{
	public void channels();
	public void volume();
}

interface smartTVremote extends TVremote
{
	public void smartTV();
	public void OTT();
}

class TV implements smartTVremote
{

	@Override
	public void channels() {
		System.out.println("50+ channels");
		
	}

	@Override
	public void volume() {
		System.out.println("Auto control");
		
	}

	@Override
	public void smartTV() {
		System.out.println("Voice activation");
		
	}

	@Override
	public void OTT() {
		System.out.println("Amazon,Netflix");
		
	}
	
}

public class TVPgm {

	public static void main(String[] args) {
		
		TV tt=new TV();
		tt.channels();
		tt.volume();
		tt.smartTV();
		tt.OTT();

	}

}
