package ch06_class.sec99_연습문제;

public class Melone_chart {
	// 노래 순위 > String
	// 노래 제목 > String
	// 가수 이름 > String
	// 앨범 이름 > String
	// 좋아요 수 > int
 	
	private String rank;
	private String title;   
	private String artist;
	private String album;
	private int like;
	
	// 생성자 만들기 (Constructor)
	public void MelonChart (String rank, String title, String artist, String album,
			int like) {
		this.rank = rank;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.like = like;
	}
	
	// getter, setter
	 public String getRank() {
		 return rank;
	 }
	 
	 public void setRank (String Rank) {
			this.rank = rank;
		}

		public String getTitle {
			return title;
		}

		public void setTitle (String Title) {
			this.title = title;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist (String Artist) {
			this.artist = artist;
			

		public String getAlbum ()  {
			return album;
			
		}

		public void setAlbum (String Album) {
			this.album = album;
		}
		 
		public int getLike () {
			return like;
		}
		
		public void setLike (int Like) {
			this.like = like;
		}
		
	

	

}
