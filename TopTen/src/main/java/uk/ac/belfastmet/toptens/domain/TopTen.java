package uk.ac.belfastmet.toptens.domain;

public class TopTen 
{
	private String song;
	private String artist;
	private String album;
	private String image;
	
	public TopTen() 
	{
		super();
	}
	

	public TopTen(String song, String artist, String album, String image) {
		super();
		this.song = song;
		this.artist = artist;
		this.album = album;
		this.image = image;
	}

	/**
	 * this method will return song
	 * @return
	 */
	public String getSong()
	{
		return song;
	}
	
	/**
	 * this method will return song
	 * @param song
	 */
	public void setSong(String song) 
	{
		this.song = song;
	}
	
	/**
	 * this method will return artists
	 * @return
	 */
	public String getArtist() 
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	public String getAlbum()
	{
		return album;
	}

	public void setAlbum(String album)
	{
		this.album = album;
	}

	public String getImage() 
	{
		return image;
	}

	public void setImage(String image) 
	{
		this.image = image;
	}
	
	public String toString()
	{
		return song + "" + album;
	}

}
