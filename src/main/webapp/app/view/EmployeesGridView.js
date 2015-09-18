Ext.define('Employees.view.EmployeesGridView', {
	extend: 'Ext.grid.Panel',
	alias: 'widget.employeesGridView',
	width: 400,
	height: 300,
	frame: true,
	store: 'EmployeesStore',
	iconCls: 'icon-user',
	viewConfig:{
		markDirty:false
	},
	columns: [
		{
			text: 'name',
			flex: 1,
			sortable: true,
			dataIndex: 'name',
			editor: {
				xtype:'textfield',
				allowBlank: false,
				blankText: 'name can not be empty'
			}
		},
		{
			flex: 2,
			text: 'position',
			sortable: true,
			dataIndex: 'position',
			editor: {
				xtype:'textfield',
				allowBlank: true
			}
		},
		{
			flex: 3,
			text: 'department',
			sortable: true,
			dataIndex: 'department',
			editor: {
				xtype:'textfield',
				allowBlank: true}
		},
		{
			flex: 4,
			text: 'email',
			sortable: true,
			dataIndex: 'email',
			editor: {
				xtype:'textfield',
				allowBlank: true
			}
		},
		{
			flex: 5,
			text: 'age',
			sortable: true,
			dataIndex: 'age',
			editor: {
				xtype:'textfield'
			}
		}
	]
});