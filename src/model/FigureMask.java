package model;

// describes the FigureMask Bitmasks
public class FigureMask {
	public byte id;
	public int bitMask;
	public boolean limited;

    public String unicode="";

    // TODO: remove later -> TESTING Method
    public static String getBitString(int mask){
        String s="";
        for(int i=0;i<32;i++){
            if((mask & ( 1 << i )) >> i==1)
                s+="1";
            else
                s+="0";
        }
        return s;
    }

    public int parse(String bitMask){
        int mask=0;
        for(int i=0;i<bitMask.toCharArray().length; i++){
            if(bitMask.toCharArray()[i]=='1')
             mask |= (1 << i);
        }
        return mask;
    }

	public FigureMask(byte id, String bitMask, boolean limited,String unicode){
		this.bitMask=this.parse(bitMask);
		this.limited=limited;
		this.id=id;
        this.unicode=unicode;
	}
}