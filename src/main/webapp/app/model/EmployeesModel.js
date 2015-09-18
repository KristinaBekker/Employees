Ext.define('Employees.model.EmployeesModel', {
	extend: 'Ext.data.Model',
	fields: ['name', 'price'],
	proxy: {
		type: 'rest',
		api: {
			create: 'employee',
			read: 'employee',
			destroy: 'employee',
			update: 'employee'
		},
		reader: {
			type: 'json',
			root: 'data',
			successProperty: 'success'
		},
		writer: {
			type: 'json',
			writeAllFields: true
		}

	}
});