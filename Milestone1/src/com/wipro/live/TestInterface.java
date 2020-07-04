package live;
import music.Playable;
import music.String.Veena;
import music.Wind.Saxophone;
public class TestInterface {
public static void main(String[] args) {
	Veena v=new Veena();
	v.play();
	Playable pv=new Veena();
	pv.play();
	Saxophone s=new Saxophone();
	s.play();
	Playable ps=new Saxophone();
	ps.play();
}
}
