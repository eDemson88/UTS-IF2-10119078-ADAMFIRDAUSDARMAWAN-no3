/*
Nama : Adam Firdaus Darmawan
NIM : 10119078
Kelas : IF-2
 */
package uts.soalno3.genremusik;

/**
 *
 * @author ryzen
 */
public class UTSSoalNo3GenreMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Blues b = new RnB();
        b.genreBlues("Jimmy Hendrix");
        Jazz j = new RnB();
        j.genreJazz("Chad Baker");
        Folk f = new Folk();
        f.genreFolk("Bob Dylan");
        Rockabilly r = new Rockabilly();
        r.genreRockabilly("ElvisPresley");
        ProgressiveRock Pr = new HardRock();
        Pr.genreProgressiveRock("Dream Theater");
        PsychedelicRock Psy = new HardRock();
        Psy.genrePsychedelicRock("The Doors");
        PopRock Por = new HardRock();
        Por.genrePopRock("KISS");
        Punk pnk = new Metal();
        pnk.genrePunk("MXPX");
        HeavyMetal Hm = new Metal();
        Hm.genreHeavyMetal("METALLICA");
        GrindCore Gr = new GrindCore();
        Gr.genreGrindCore("Mesin Tempur");
        DeathMetal Dm = new DeathMetal();
        Dm.genreDeatMetal("JASAD");
        DeathCoreKepiting DCK = new DeathCoreKepiting();
        DCK.genreDeathCoreKepiting("Revenge The Fate");
        BlackMetal Bm = new BlackMetal();
        Bm.genreBlackMetal("Behemoth");
        NewSkul NS = new NewSkul();
        NS.genreNewSkul("HATEBREED");
    }
    
}
