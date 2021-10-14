package pokemon;

public class Pokemon {

	private String nom;
	private int hp;
	private int atk;
	
	public Pokemon() {}

	public Pokemon(String nom, int hp, int atk) {
		this.nom = nom;
		this.hp = hp;
		this.atk = atk;
	}
	
	public boolean isDead() {
		
		if (hp == 0) {
			return true;
		} else {
			return false;
		}	
	}	
	
	public int attaquer(Pokemon pokemon) {
		System.out.println(this.getNom()+" attaque "+this.nom+" !");
		hp = atk-hp;
		return hp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	@Override
	public String toString() {
		return "Pokemon [nom=" + nom + ", hp=" + hp + ", atk=" + atk + "]";
	}
	
	
}
