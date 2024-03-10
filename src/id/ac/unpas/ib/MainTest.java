package id.ac.unpas.ib;

import id.ac.unpas.ib.bfs.BreadthFirstSearch;
import id.ac.unpas.ib.dls.DepthLimitedSearch;
import id.ac.unpas.ib.ucs.NodeUCS;
import id.ac.unpas.ib.ucs.UniformCostSearch;

public class MainTest {
    public static void main(String[] args) {
        Node jakarta = new Node("Jakarta");
        Node depok = new Node("Depok");
        Node bekasi = new Node("Bekasi");
        Node bogor = new Node("Bogor");
        Node cibodas = new Node("Cibodas");
        Node cianjur = new Node("Cianjur");
        Node cipatat = new Node("Cipatat");
        Node padalarang = new Node("Padalarang");
        Node cikarang = new Node("Cikarang");
        Node cikampek = new Node("Cikampek");
        Node purwakarta = new Node("Purwakarta");
        Node cikalong = new Node("Cikalong");
        Node bandung = new Node("Bandung");
        
        jakarta.addTetangga(depok);
        jakarta.addTetangga(bekasi);
        jakarta.addTetangga(bogor);
        
        depok.addTetangga(jakarta);
        depok.addTetangga(bekasi);
        
        bekasi.addTetangga(depok);
        bekasi.addTetangga(bogor);
        bekasi.addTetangga(jakarta);
        bekasi.addTetangga(cikarang);
        
        cikarang.addTetangga(bekasi);
        cikarang.addTetangga(cikampek);
        
        cikampek.addTetangga(cikarang);
        cikampek.addTetangga(purwakarta);
        
        purwakarta.addTetangga(cikampek);
        purwakarta.addTetangga(cikalong);
        
        cikalong.addTetangga(purwakarta);
        cikalong.addTetangga(padalarang);
        
        bogor.addTetangga(bekasi);
        bogor.addTetangga(cibodas);
        
        cibodas.addTetangga(bogor);
        cibodas.addTetangga(cianjur);
        
        cianjur.addTetangga(cibodas);
        cianjur.addTetangga(cipatat);
        
        cipatat.addTetangga(cianjur);
        cipatat.addTetangga(padalarang);
        
        padalarang.addTetangga(cipatat);
        padalarang.addTetangga(bandung);
        
        bandung.addTetangga(padalarang);       
        
        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(jakarta, bandung);
        System.out.println();

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(jakarta, bandung);
        System.out.println();

        NodeUCS jakartaUCS = new NodeUCS(jakarta, 400);
        NodeUCS depokUCS = new NodeUCS(depok, 300);
        NodeUCS bekasiUCS = new NodeUCS(bekasi, 451);
        NodeUCS bogorUCS = new NodeUCS(bogor, 250);
        NodeUCS cibodasUCS = new NodeUCS(cibodas, 240);
        NodeUCS cianjurUCS = new NodeUCS(cianjur, 233);
        NodeUCS cipatatUCS = new NodeUCS(cipatat, 230);
        NodeUCS padalarangUCS = new NodeUCS(padalarang, 183);
        NodeUCS cikarangUCS = new NodeUCS(cikarang, 423);
        NodeUCS cikampekUCS = new NodeUCS(cikampek, 10);
        NodeUCS purwakartaUCS = new NodeUCS(purwakarta, 78);
        NodeUCS cikalongUCS = new NodeUCS(cikalong, 222);
        NodeUCS bandungUCS = new NodeUCS(bandung, 150);
        

        jakartaUCS.addTetangga(depokUCS);
        jakartaUCS.addTetangga(bekasiUCS);
        jakartaUCS.addTetangga(bogorUCS);

        depokUCS.addTetangga(jakartaUCS);
        depokUCS.addTetangga(bekasiUCS);

        bekasiUCS.addTetangga(depokUCS);
        bekasiUCS.addTetangga(bogorUCS);
        bekasiUCS.addTetangga(jakartaUCS);
        bekasiUCS.addTetangga(cikarangUCS);

        cikarangUCS.addTetangga(bekasiUCS);
        cikarangUCS.addTetangga(cikampekUCS);

        cikampekUCS.addTetangga(cikarangUCS);
        cikampekUCS.addTetangga(purwakartaUCS);

        purwakartaUCS.addTetangga(cikampekUCS);
        purwakartaUCS.addTetangga(cikalongUCS);

        cikalongUCS.addTetangga(purwakartaUCS);
        cikalongUCS.addTetangga(padalarangUCS);

        bogorUCS.addTetangga(bekasiUCS);
        bogorUCS.addTetangga(cibodasUCS);

        cibodasUCS.addTetangga(bogorUCS);
        cibodasUCS.addTetangga(cianjurUCS);

        cianjurUCS.addTetangga(cibodasUCS);
        cianjurUCS.addTetangga(cipatatUCS);

        cipatatUCS.addTetangga(cianjurUCS);
        cipatatUCS.addTetangga(padalarangUCS);

        padalarangUCS.addTetangga(cipatatUCS);
        padalarangUCS.addTetangga(bandungUCS);

        bandungUCS.addTetangga(padalarangUCS);

        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(jakartaUCS, bandungUCS);
        System.out.println();
    }
}
