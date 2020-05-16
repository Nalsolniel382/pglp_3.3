package fr.uvsq.exo3_3;

public class Robot {
	private Position p;
	private Direction d;
	
	
	public Robot (Position pos, Direction dir) {
		this.d=dir;
		this.p=pos; 
		
	}

	public void avencer () {
		int tmp;
		switch(this.d)
		{
			case nord:
				tmp= this.p.getY()+1;
				this.p.setY(tmp); 
			break;
			case est:
				tmp= this.p.getX()+1;
				this.p.setX(tmp);
			break;
			case sud:
				tmp= this.p.getY()-1;
				this.p.setY(tmp);
			break;
			case ouest:
				tmp= this.p.getX()-1;
				this.p.setX(tmp);
			break;
			default:
			break;
		}
		
	}
	public void tourner() {
		
		switch(this.d)
		{
			case nord:
				this.d = Direction.est;
			break;
			case est:
				this.d = Direction.sud;
			break;
			case sud:
				this.d = Direction.ouest;
			break;
			case ouest:
				this.d = Direction.nord;
			break;
			default:
			break;
		}
		
		
		
	}

	public Position getP() {
		return p;
	}

	public void setP(Position p) {
		this.p = p;
	}

	public Direction getD() {
		return d;
	}

	public void setD(Direction d) {
		this.d = d;
	}
	
}
