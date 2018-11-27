package beans.dto;

import java.util.Arrays;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="upload_table")
public class UploadFile 
{
		@Id
		@GeneratedValue
		private long id;
	    private String fileName;
	    private byte[] data;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		public byte[] getData() {
			return data;
		}
		public void setData(byte[] data) {
			this.data = data;
		}
		@Override
		public String toString() {
			return "UploadFile [id=" + id + ", fileName=" + fileName + ", data=" + Arrays.toString(data) + "]";
		}
	    

}
