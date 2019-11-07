package com.coding.question;

public class Kit {
	
	private String pads;
	private String bat;
	private String guard;
	private String helmet;

	public Kit setPads(String pads) {
		this.pads = pads;
		return this;
	}

	public Kit setBat(String bat) {
		this.bat = bat;
		return this;
	}

	public Kit setGuard(String guard) {
		this.guard = guard;
		return this;
	}

	public Kit setHelmet(String helmet) {
		this.helmet = helmet;
		return this;
	}

	@Override
	public String toString() {
		return "Kit : [pads:" + "\""+ pads+ "\""+ ", bat:" + "\""+ bat+ "\""+ ", guard:" + "\""+ guard+ "\""+ ", helmet:" + "\""+ helmet+ "\""+ "]";
	}

	public static void main(String[] args) {
		Kit k = new Kit();
		k.setBat("mrf bat").setGuard("mrfguard").setHelmet("bas").setPads("foam");
		System.out.println(k);
	}

}
