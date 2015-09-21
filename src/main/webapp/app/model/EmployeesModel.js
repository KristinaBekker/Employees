Ext.define('Employees.model.EmployeesModel', {
	extend: 'Ext.data.Model',
	fields: ['name', 'price'],
	proxy: {
		type: 'rest',
		api: {
			read: 'employees',
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