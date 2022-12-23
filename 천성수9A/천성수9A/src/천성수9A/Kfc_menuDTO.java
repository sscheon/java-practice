package 천성수9A;

//	IDX	NUMBER	No	"C##ITBANK"."KFC_MENU_SEQ"."NEXTVAL"	
//	NAME	VARCHAR2(100 BYTE)
//	PRICE	VARCHAR2(100 BYTE)
//	CATEGORY	VARCHAR2(50 BYTE)	
//	MEMO	VARCHAR2(255 BYTE)
//	IMGPATH	VARCHAR2(100 BYTE)
//	DELETECK	VARCHAR2(10 BYTE)	

public class Kfc_menuDTO {
	
	private int idx;
	private String name;
	private String price;
	private String category;
	private String memo;
	private String imgPath;
	private String deleteck;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getDeleteck() {
		return deleteck;
	}
	public void setDeleteck(String deleteck) {
		this.deleteck = deleteck;
	}
	
}
