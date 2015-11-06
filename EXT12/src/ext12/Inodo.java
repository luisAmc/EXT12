/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext12;

/**
 *
 * @author Luis Martinez
 */
public class Inodo {
    private int[] i_mode;       //Lectura, escritura y ejecucion
    private int i_uid;          //id del usuario
    private int i_size;         //tamano en bytes
    private int i_atime;        //fecha de acceso
    private int i_ctime;        //fecha de alteracion
    private int i_mtime;        //fecha de modificion 
    private int i_dtime;        //
    private int i_gid;          //id del grupo
    private int i_links_count;  //cantidad de enlaces
    private int i_blocks;
    private int i_block[];
    
    //12 punteros a bloques directos
    //1 puntero a bloque indirecto
    //1 puntero a bloque doble indirecto
}
