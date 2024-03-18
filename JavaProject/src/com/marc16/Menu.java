package com.marc16;

public class Menu {
	 	private int menuId;
	    
	    private String menuName;
	    
	    private int menuPrise;
	    
	    private String menuCategory;
	    
	    private int quantity;

		@Override
		public String toString() {
			return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", menuPrise=" + menuPrise + ", menuCategory="
					+ menuCategory + ", quantity=" + quantity + "]";
		}

		public Menu(int menuId, String menuName, int menuPrise, String menuCategory, int quantity) {
			super();
			this.menuId = menuId;
			this.menuName = menuName;
			this.menuPrise = menuPrise;
			this.menuCategory = menuCategory;
			this.quantity = quantity;
		}

		public Menu() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getMenuId() {
			return menuId;
		}

		public void setMenuId(int menuId) {
			this.menuId = menuId;
		}

		public String getMenuName() {
			return menuName;
		}

		public void setMenuName(String menuName) {
			this.menuName = menuName;
		}

		public int getMenuPrise() {
			return menuPrise;
		}

		public void setMenuPrise(int menuPrise) {
			this.menuPrise = menuPrise;
		}

		public String getMenuCategory() {
			return menuCategory;
		}

		public void setMenuCategory(String menuCategory) {
			this.menuCategory = menuCategory;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		
	  

		
} 
