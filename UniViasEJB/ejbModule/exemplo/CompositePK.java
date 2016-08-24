package exemplo;

import javax.persistence.Embeddable;

@Embeddable
class CompositePK {	
	long id;
	long id2;
	
	public CompositePK(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId2() {
		return id2;
	}

	public void setId2(long id2) {
		this.id2 = id2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (id2 ^ (id2 >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompositePK other = (CompositePK) obj;
		if (id != other.id)
			return false;
		if (id2 != other.id2)
			return false;
		return true;
	}
}
