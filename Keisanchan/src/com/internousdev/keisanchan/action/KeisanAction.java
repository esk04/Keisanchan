package com.internousdev.keisanchan.action;

import com.opensymphony.xwork2.ActionSupport;

public class KeisanAction extends ActionSupport{

	private double toki;
	private double zikoshi;
	private double keijo;
	private double uriage;
	private double uriage_sori;
	private double eigyo;
	private double total_assets;
	private double uriage_saiken;
	private double uriage_genka;
	private double tana;
	private double ryudo_assets;
	private double ryudo_fusai;
	private double kotei_assets;
	private double total_fusai;

	private double roe = 0d;
	private double roa = 0d;
	private double uriage_keijo_ratio = 0d;
	private double uriage_sori_ratio = 0d;
	private double uriage_eigyo_ratio = 0d;

	private double total_kaiten_ratio = 0d;
	private double zaiko_kaiten_ratio = 0d;

	private double ryudo_ratio = 0d;
	private double zikoshi_ratio = 0d;
	private double kotei_ratio = 0d;
	private double fusai_ratio = 0d;

		public String execute(){
		 roe = toki/zikoshi;
		 roa = toki/total_assets;
		 uriage_keijo_ratio = keijo/uriage;
		 uriage_sori_ratio = uriage_sori/uriage;
		 uriage_eigyo_ratio = eigyo/uriage;

		 total_kaiten_ratio = uriage/total_assets;
		 zaiko_kaiten_ratio = uriage_genka/tana;

		 ryudo_ratio = ryudo_assets/ryudo_fusai;
		 zikoshi_ratio = zikoshi/total_assets;
		 kotei_ratio = kotei_assets/zikoshi;
		 fusai_ratio = total_fusai/zikoshi;
		 return SUCCESS;
	}


		public double getToki() {
			return toki;
		}


		public void setToki(double toki) {
			this.toki = toki;
		}


		public double getZikoshi() {
			return zikoshi;
		}


		public void setZikoshi(double zikoshi) {
			this.zikoshi = zikoshi;
		}


		public double getKeijo() {
			return keijo;
		}


		public void setKeijo(double keijo) {
			this.keijo = keijo;
		}


		public double getUriage() {
			return uriage;
		}


		public void setUriage(double uriage) {
			this.uriage = uriage;
		}


		public double getUriage_sori() {
			return uriage_sori;
		}


		public void setUriage_sori(double uriage_sori) {
			this.uriage_sori = uriage_sori;
		}


		public double getEigyo() {
			return eigyo;
		}


		public void setEigyo(double eigyo) {
			this.eigyo = eigyo;
		}


		public double getTotal_assets() {
			return total_assets;
		}


		public void setTotal_assets(double total_assets) {
			this.total_assets = total_assets;
		}


		public double getUriage_saiken() {
			return uriage_saiken;
		}


		public void setUriage_saiken(double uriage_saiken) {
			this.uriage_saiken = uriage_saiken;
		}


		public double getUriage_genka() {
			return uriage_genka;
		}


		public void setUriage_genka(double uriage_genka) {
			this.uriage_genka = uriage_genka;
		}


		public double getTana() {
			return tana;
		}


		public void setTana(double tana) {
			this.tana = tana;
		}


		public double getRyudo_assets() {
			return ryudo_assets;
		}


		public void setRyudo_assets(double ryudo_assets) {
			this.ryudo_assets = ryudo_assets;
		}


		public double getRyudo_fusai() {
			return ryudo_fusai;
		}


		public void setRyudo_fusai(double ryudo_fusai) {
			this.ryudo_fusai = ryudo_fusai;
		}


		public double getKotei_assets() {
			return kotei_assets;
		}


		public void setKotei_assets(double kotei_assets) {
			this.kotei_assets = kotei_assets;
		}


		public double getTotal_fusai() {
			return total_fusai;
		}


		public void setTotal_fusai(double total_fusai) {
			this.total_fusai = total_fusai;
		}


		public double getRoe() {
			return roe;
		}


		public void setRoe(double roe) {
			this.roe = roe;
		}


		public double getRoa() {
			return roa;
		}


		public void setRoa(double roa) {
			this.roa = roa;
		}


		public double getUriage_keijo_ratio() {
			return uriage_keijo_ratio;
		}


		public void setUriage_keijo_ratio(double uriage_keijo_ratio) {
			this.uriage_keijo_ratio = uriage_keijo_ratio;
		}


		public double getUriage_sori_ratio() {
			return uriage_sori_ratio;
		}


		public void setUriage_sori_ratio(double uriage_sori_ratio) {
			this.uriage_sori_ratio = uriage_sori_ratio;
		}


		public double getUriage_eigyo_ratio() {
			return uriage_eigyo_ratio;
		}


		public void setUriage_eigyo_ratio(double uriage_eigyo_ratio) {
			this.uriage_eigyo_ratio = uriage_eigyo_ratio;
		}


		public double getTotal_kaiten_ratio() {
			return total_kaiten_ratio;
		}


		public void setTotal_kaiten_ratio(double total_kaiten_ratio) {
			this.total_kaiten_ratio = total_kaiten_ratio;
		}


		public double getZaiko_kaiten_ratio() {
			return zaiko_kaiten_ratio;
		}


		public void setZaiko_kaiten_ratio(double zaiko_kaiten_ratio) {
			this.zaiko_kaiten_ratio = zaiko_kaiten_ratio;
		}


		public double getRyudo_ratio() {
			return ryudo_ratio;
		}


		public void setRyudo_ratio(double ryudo_ratio) {
			this.ryudo_ratio = ryudo_ratio;
		}


		public double getZikoshi_ratio() {
			return zikoshi_ratio;
		}


		public void setZikoshi_ratio(double zikoshi_ratio) {
			this.zikoshi_ratio = zikoshi_ratio;
		}


		public double getKotei_ratio() {
			return kotei_ratio;
		}


		public void setKotei_ratio(double kotei_ratio) {
			this.kotei_ratio = kotei_ratio;
		}


		public double getFusai_ratio() {
			return fusai_ratio;
		}


		public void setFusai_ratio(double fusai_ratio) {
			this.fusai_ratio = fusai_ratio;
		}


=======
	@SuppressWarnings("unused")
	public String execute()throws Exception{
		double roe = toki/zikoshi;
		double roa = toki/total_assets;
		double uriage_keijo_ratio = keijo/uriage;
		double uriage_sori_ratio = uriage_sori/uriage;
		double uriage_eigyo_ratio = eigyo/uriage;

		double total_kaiten_ratio = uriage/total_assets;
		double zaiko_kaiten_ratio = uriage_genka/tana;

		double ryudo_ratio = ryudo_assets/ryudo_fusai;
		double zikoshi_ratio = zikoshi/total_assets;
		double kotei_ratio = kotei_assets/zikoshi;
		double fusai_ratio = total_fusai/zikoshi;
		return null;
	}


	public double getToki(){
		return this.toki;
	}
	public double getZikoshi(){
		return this.zikoshi;
	}
	public double getKeijo(){
		return this.keijo;
	}
	public double getUriage(){
		return this.uriage;
	}
	public double getUriage_sori(){
		return this.uriage_sori;
	}
	public double getEigyo(){
		return this.eigyo;
	}
	public double getTotal_assets(){
		return this.total_assets;
	}
	public double getUriagesaiken(){
		return this.uriage_saiken;
	}
	public double getUriage_genka(){
		return this.uriage_genka;
	}
	public double getTana(){
		return this.tana;
	}
	public double getRyudo_assets(){
		return this.ryudo_assets;
	}
	public double getRyudo_fusai(){
		return this.ryudo_fusai;
	}
	public double getKotei_assets(){
		return this.kotei_assets;
	}
	public double getTotal_fusai(){
		return this.total_fusai;
	}


>>>>>>> 5aecbadb51d311424cf5379840e41bfb406e00a1


}